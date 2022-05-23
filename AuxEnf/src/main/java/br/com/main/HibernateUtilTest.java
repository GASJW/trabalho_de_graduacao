package br.com.main;

import org.hibernate.Session;

import br.com.auxenf.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}

}
