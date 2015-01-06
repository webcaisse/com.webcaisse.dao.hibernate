package com.webcaisse.dao.hibernate.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webcaisse.dao.hibernate.ISessionDao;
import com.webcaisse.dao.hibernate.model.Commande;
import com.webcaisse.dao.hibernate.model.Session;
import com.webcaisse.dao.hibernate.model.User;

public class SessionDao implements ISessionDao {
	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public Session loadSessionById(Long sessionId) {
		Query req = sessionFactory.getCurrentSession().createQuery("select s from Session s where s.id=:id " ) ;
		 req.setParameter("id", sessionId) ;
		 return (Session) req.uniqueResult() ;
	}

	
	@Transactional
	public List<Commande> rechercherCommande(Long idSession) {
		 Query req = sessionFactory.getCurrentSession().createQuery("select c from Commande c where c.session.id=:x " ) ;
		    req.setParameter("x", idSession) ;
		    return req.list() ;
	
	}

	@Transactional
	public List<Commande> rechercherCommandeParDate(Long idSociete, Date dateCommande) {
		
		Date start = DateUtils.truncate(dateCommande, Calendar.DATE);
		Date end = DateUtils.addSeconds(DateUtils.addMinutes(DateUtils.addHours(start, 23), 59), 59);
		
		 Query req = sessionFactory.getCurrentSession().createQuery("select c from Commande c where c.societe.id=:x  and (c.dateCommande between :start and :end)" ) ;
		    req.setParameter("x", idSociete) ;
		    req.setParameter("start", start) ;
		    req.setParameter("end", end) ;

		    return req.list() ;
	
	
	}
	
	@Transactional
	public  List<Session> getSessionByUserIdAndDate(Long idUser, Date date){
//		String to_date  = sdf.format(date);
		Query req = sessionFactory.getCurrentSession().createQuery("select s from Session s where s.user.id=:id "
				+ " and day(s.dateOuverture) = day(:date) and month(s.dateOuverture) = month(:date) and year(s.dateOuverture) = year(:date) and s.etat='O'" ) ;
		 req.setParameter("id", idUser);
		 req.setParameter("date", date);
		
		
		return (List<Session>) req.list();
	}

	
    @Transactional
    public Long creerSession(Long idUser, Date date) {
    	
    	Session session = new Session() ;
    	User user = new User() ;
    	user.setId(idUser);
    	session.setUser(user);
    	session.setDateOuverture(date);
    	session.setEtat('O');

    	return (Long) sessionFactory.getCurrentSession().save(session) ;
	}

   @Transactional
   public void updateSession(Session session){
    	sessionFactory.getCurrentSession().update(session); 
    	
    }

}
