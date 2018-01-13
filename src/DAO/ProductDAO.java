package DAO;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Model.DbConfig;
import Model.Product;

public class ProductDAO 
{
	
	Session sess;
	Transaction trans;
	private boolean b = true;
	public boolean insertProduct(Product p)
	{
	
	try{
	DbConfig db=new DbConfig();
	
Session sess=db.getSess();
sess.beginTransaction();
sess.beginTransaction();
sess.saveOrUpdate(p);
trans.commit();

}
	catch(Exception ex)
	{
		ex.printStackTrace();
		trans.rollback();
	 b=false;
	
	}
	return b;
}
	public void getProduct()
	{
		Query query=sess.createQuery("from Product");
		
	}
	public boolean deleteProduct(Product p)
	{
	
	try{
	DbConfig db=new DbConfig();
	
Session sess=db.getSess();
trans=sess.beginTransaction();
Product p1=(Product)sess.get(Product.class, p.getPid());
sess.delete(p1);
trans.commit();

}
	catch(Exception ex)
	{
		ex.printStackTrace();
		trans.rollback();
	 b=false;
	
	}
	return b;
}
}
