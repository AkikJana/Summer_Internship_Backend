package com.higradius;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class importc {
	public static java.sql.Date convertdate(java.util.Date x){
        java.sql.Date sqlDate = new java.sql.Date(x.getTime());
        return sqlDate;   
    }
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		String line = "";  
		String splitBy = ","; 
		Connection dbCon = null;
		
		
		ArrayList<employee_invoice>rows=new ArrayList<>();
		try{  
			
			br = new BufferedReader(new FileReader("D:\\Highradius\\Data1.csv"));
			Class.forName("com.mysql.cj.jdbc.Driver");  
			 dbCon=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/project","root","root");  
			 int i=0;
			//Statement stmt=dbCon.createStatement(); 
			line=br.readLine();
			while ((line = br.readLine()) != null)   
			{  
				String[] inv = line.split(splitBy,-1);
				employee_invoice tmp=new employee_invoice();
				//new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++])
				//Float.parseFloat(inv[i++])
				//Integer.parseInt(inv[i++])
				//MM-dd--yyyy
				if(inv[i].equals("")) {
					tmp.setAcct_doc_header_id(0);
					i++;
				}
				else {
					tmp.setAcct_doc_header_id(Integer.parseInt(inv[i++]));
				}
				//tmp.setAcct_doc_header_id(Integer.parseInt(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setCompany_id(0);
					i++;
				}
				else {
					tmp.setCompany_id(Integer.parseInt(inv[i++]));
				}
				//tmp.setCompany_id(Integer.parseInt(inv[i++])); 
				if(inv[i].equals("")) {
					tmp.setDocument_number(0);
					i++;
				}
				else {
					tmp.setDocument_number(Integer.parseInt(inv[i++]));
				}
				//tmp.setDocument_number(Integer.parseInt(inv[i++]));  
				if(inv[i].equals("")) {
					tmp.setDocument_number_norm(0);
					i++;
				}
				else {
					tmp.setDocument_number_norm(Integer.parseInt(inv[i++]));
				}
				//tmp.setDocument_number_norm(Integer.parseInt(inv[i++]));
				
				tmp.setBusiness_code(inv[i++]);
				tmp.setCreate_year(inv[i++]); 
				if(inv[i].equals("")) {
					tmp.setDocument_line_number(0);
					i++;
				}
				else {
					tmp.setDocument_line_number(Integer.parseInt(inv[i++]));
				}
				//tmp.setDocument_line_number(Integer.parseInt(inv[i++]));
				tmp.setDoctype(inv[i++]); 
				if(inv[i].equals("")) {
					tmp.setCustomer_number(0);
					i++;
				}
				else {
					tmp.setCustomer_number(Integer.parseInt(inv[i++]));
				}
				//tmp.setCustomer_number(Integer.parseInt(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setCustomer_number_norm(0);
					i++;
				}
				else {
					tmp.setCustomer_number_norm(Integer.parseInt(inv[i++]));
				}
				//tmp.setCustomer_number_norm (Integer.parseInt(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setFk_customer_map_id(0);
					i++;
				}
				else {
					tmp.setFk_customer_map_id(Integer.parseInt(inv[i++]));
				}
				//tmp.setFk_customer_map_id(Integer.parseInt(inv[i++]));
				tmp.setCustomer_name(inv[i++]);
				tmp.setDivision(inv[i++]);
				if(inv[i].equals("")) {
					tmp.setDocument_create_date(null);
					i++;
				}
				else {
					tmp.setDocument_create_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				//tmp.setDocument_create_date((Date) new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setDocument_create_date_norm(null);
					i++;
				}
				else {
					tmp.setDocument_create_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				//tmp.setDocument_create_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setPosting_date(null);
					i++;
				}
				else {
					tmp.setPosting_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				if(inv[i].equals("")) {
					tmp.setPosting_date_norm(null);
					i++;
				}
				else {
					tmp.setPosting_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				tmp.setPosting_id(inv[i++]); 
				if(inv[i].equals("")) {
					tmp.setDue_date(null);
					i++;
				}
				else {
					tmp.setDue_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				if(inv[i].equals("")) {
					tmp.setDue_date_norm(null);
					i++;
				}
				else {
					tmp.setDue_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				if(inv[i].equals("")) {
					tmp.setOrder_date(null);
					i++;
				}
				else {
					tmp.setOrder_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				if(inv[i].equals("")) {
					tmp.setOrder_date_norm(null);
					i++;
				}
				else {
					tmp.setOrder_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				
				if(inv[i].equals("")) {
					tmp.setInvoice_id(0);
					i++;
				}
				else {
					tmp.setInvoice_id(Integer.parseInt(inv[i++]));
				}
				//tmp.setInvoice_id(Integer.parseInt(inv[i++]));

				if(inv[i].equals("")) {
					tmp.setInvoice_id_norm(0);
					i++;
				}
				else {
					tmp.setInvoice_id_norm(Integer.parseInt(inv[i++]));
				}
				//tmp.setInvoice_id_norm(Integer.parseInt(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setBaseline_create_date(null);
					i++;
				}
				else {
					tmp.setBaseline_create_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				if(inv[i].equals("")) {
					tmp.setInvoice_date_norm(null);
					i++;
				}
				else {
					tmp.setInvoice_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				
				if(inv[i].equals("")) {
					tmp.setTotal_open_amount(0F);
					i++;
				}
				else {
					tmp.setTotal_open_amount(Float.parseFloat(inv[i++]));
				}
				//tmp.setTotal_open_amount(Float.parseFloat(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setTotal_open_amount_norm(0F);
					i++;
				}
				else {
					tmp.setTotal_open_amount_norm(Float.parseFloat(inv[i++]));
				}
				//tmp.setTotal_open_amount_norm(Float.parseFloat(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setCust_payment_terms(0);
					i++;
				}
				else {
					tmp.setCust_payment_terms(Integer.parseInt(inv[i++]));
				}
				//tmp.setCust_payment_terms(Integer.parseInt(inv[i++]));
				tmp.setBusiness_area(inv[i++]); 
				
				if(inv[i].equals("")) {
					tmp.setShip_date(null);
					i++;
				}
				else {
					tmp.setShip_date((Date)new SimpleDateFormat("mm/DD/yyyy").parse(inv[i++]));
				}
				
				
				tmp.setShip_to(inv[i++]);
				if(inv[i].equals("")) {
					tmp.setClearing_date(null);
					i++;
				}
				else {
					tmp.setClearing_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				//tmp.setClearing_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setClearing_date_norm(null);
					i++;
				}
				else {
					tmp.setClearing_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				//tmp.setClearing_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				tmp.setReason_code(inv[i++]); 
				tmp.setIsOpen(Integer.parseInt(inv[i++]));
				
				if(inv[i].equals("")) {
					tmp.setDiscount_due_date_norm(null);
					i++;
				}
				else {
					tmp.setDiscount_due_date_norm((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				tmp.setDebit_credit_indicator(inv[i++]); 
				tmp.setPayment_method(inv[i++]);
				
				if(inv[i].equals("")) {
					tmp.setDocument_creation_date(null);
					i++;
				}
				else {
					tmp.setDocument_creation_date((Date)new SimpleDateFormat("yyyy-MM-dd").parse(inv[i++]));
				}
				
				
				if(inv[i].equals("")) {
					tmp.setInvoice_amount_doc_currency(0F);
					i++;
				}
				else {
					tmp.setInvoice_amount_doc_currency(Float.parseFloat(inv[i++]));
				}
				//tmp.setInvoice_amount_doc_currency (Float.parseFloat(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setDocument_id(0);
					i++;
				}
				else {
					tmp.setDocument_id(Integer.parseInt(inv[i++]));
				}
				//tmp.setDocument_id(Integer.parseInt(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setActual_open_amount(0F);
					i++;
				}
				else {
					tmp.setActual_open_amount(Float.parseFloat(inv[i++]));
				}
				//tmp.setActual_open_amount (Float.parseFloat(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setPaid_amount(0F);
					i++;
				}
				else {
					tmp.setPaid_amount(Float.parseFloat(inv[i++]));
				}
				//tmp.setPaid_amount (Float.parseFloat(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setDayspast_due(0);
					i++;
				}
				else {
					tmp.setDayspast_due(Integer.parseInt(inv[i++]));
				}
				//tmp.setDayspast_due(Integer.parseInt(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setInvoice_age(0);
					i++;
				}
				else {
					tmp.setInvoice_age(Integer.parseInt(inv[i++]));
				}
				//tmp.setInvoice_age(Integer.parseInt(inv[i++]));
				if(inv[i].equals("")) {
					tmp.setDisputed_amount(0F);
					i++;
				}
				else {
					tmp.setDisputed_amount(Float.parseFloat(inv[i++]));
				}
						rows.add(tmp);
						i=0;
		//	for(int i=0;i<employee.length;i++) {
				
			//}
						//System.out.println(tmp.getAcct_doc_header_id());
						//System.out.println(tmp.getInvoice_age());
			
			} 
			//ResultSet rs=stmt.executeQuery("select * from customer_invoice"); 
			PreparedStatement pstmt=null;
			employee_invoice j;
			int rs;
			final int batchSize = 1000;
			int count = 0;
			String Insertqry="INSERT INTO customer_invoice (acct_doc_header_id, company_id, document_number, document_number_norm,business_code, create_year, document_line_number, doctype, customer_number, customer_number_norm,fk_customer_map_id, customer_name, division, document_create_date, document_create_date_norm,posting_date, posting_date_norm, posting_id, due_date, due_date_norm, order_date, order_date_norm,invoice_id, invoice_id_norm, baseline_create_date, invoice_date_norm, total_open_amount, total_open_amount_norm,cust_payment_terms, business_area, ship_date, ship_to, clearing_date , clearing_date_norm ,reason_code, isOpen, discount_due_date_norm, debit_credit_indicator, payment_method, document_creation_date,invoice_amount_doc_currency, document_id, actual_open_amount, paid_amount, dayspast_due, invoice_age, disputed_amount) VALUES (?, ?, ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			 pstmt=dbCon.prepareStatement(Insertqry);
			for(int k=0;k<rows.size();k++) {
				 //pstmt = dbCon.prepareStatement(tst);
				 j=rows.get(k);
				 
				 if (j.getAcct_doc_header_id()==0) pstmt.setNull(1, Types.NULL);
			        else pstmt.setInt(1, j.getAcct_doc_header_id());
			        if (j.getCompany_id()==0) pstmt.setNull(2, Types.NULL);
			        else pstmt.setInt(2, j.getCompany_id());
			        if (j.getDocument_number()==0) pstmt.setNull(3, Types.NULL);
			        else pstmt.setInt(3, j.getDocument_number());
			        if (j.getDocument_number_norm()==0) pstmt.setNull(4, Types.NULL);
			        else pstmt.setInt(4, j.getDocument_number_norm());
			        pstmt.setString(5, j.getBusiness_code());
			        pstmt.setString(6, j.getCreate_year());
			        if (j.getDocument_line_number()==0) pstmt.setNull(7, Types.NULL);
			        else pstmt.setInt(7, j.getDocument_line_number());
			        pstmt.setString(8, j.getDoctype());
			        if (j.getCustomer_number()==0) pstmt.setNull(9, Types.NULL);
			        else pstmt.setInt(9, j.getCustomer_number());
			        if (j.getCustomer_number_norm()==0) pstmt.setNull(10, Types.NULL);
			        else pstmt.setInt(10, j.getCustomer_number_norm());
			        if (j.getFk_customer_map_id()==0) pstmt.setNull(11, Types.NULL);
			        else pstmt.setInt(11, j.getFk_customer_map_id());
			        pstmt.setString(12, j.getCustomer_name());
			        pstmt.setString(13, j.getDivision());
			        if (j.getDocument_create_date()==null) pstmt.setNull(14, Types.NULL);
			        else pstmt.setDate(14,convertdate(j.getDocument_create_date()));
			        if (j.getDocument_create_date_norm()==null) pstmt.setNull(15, Types.NULL);
			        else pstmt.setDate(15, convertdate(j.getDocument_create_date_norm()));
			        if (j.getPosting_date()==null) pstmt.setNull(16, Types.NULL);
			        else pstmt.setDate(16, convertdate(j.getPosting_date()));
			        if (j.getPosting_date_norm()==null) pstmt.setNull(17, Types.NULL);
			        else pstmt.setDate(17, convertdate(j.getPosting_date_norm()));
			        if (j.getPosting_id()==null) pstmt.setNull(18, Types.NULL);
			        else pstmt.setString(18, j.getPosting_id());
			        if (j.getDue_date()==null) pstmt.setNull(19, Types.NULL);
			        else pstmt.setDate(19, convertdate(j.getDue_date()));
			        if (j.getDue_date_norm()==null) pstmt.setNull(20, Types.NULL);
			        else pstmt.setDate(20, convertdate(j.getDue_date_norm()));
			        if (j.getOrder_date()==null) pstmt.setNull(21, Types.NULL);
			        else pstmt.setDate(21, convertdate(j.getOrder_date()));
			        if (j.getOrder_date_norm()==null) pstmt.setNull(22, Types.NULL);
			        else pstmt.setDate(22, convertdate(j.getOrder_date_norm()));
			        if (j.getInvoice_id()==0) pstmt.setNull(23, Types.NULL);
			        else pstmt.setInt(23, j.getInvoice_id());
			        if (j.getInvoice_id_norm()==0) pstmt.setNull(24, Types.NULL);
			        else pstmt.setInt(24, j.getInvoice_id_norm());
			        if (j.getBaseline_create_date()==null) pstmt.setNull(25, Types.NULL);
			        else pstmt.setDate(25, convertdate(j.getBaseline_create_date()));
			        if (j.getInvoice_date_norm()==null) pstmt.setNull(26, Types.NULL);
			        else pstmt.setDate(26, convertdate(j.getInvoice_date_norm()));
			        pstmt.setFloat(27, j.getTotal_open_amount());
			        pstmt.setFloat(28, j.getTotal_open_amount_norm());
			        if (j.getCust_payment_terms()==0) pstmt.setNull(29, Types.NULL);
			        else pstmt.setInt(29, j.getCust_payment_terms());
			        if (j.getBusiness_area()==null) pstmt.setNull(30, Types.NULL);
			        else pstmt.setString(30, j.getBusiness_area());
			        if (j.getShip_date()==null) pstmt.setNull(31, Types.NULL);
			        else pstmt.setDate(31, convertdate(j.getShip_date()));
			        if (j.getShip_to()==null) pstmt.setNull(32, Types.NULL);
			        else pstmt.setString(32, j.getShip_to());
			        if (j.getClearing_date()==null) pstmt.setNull(33, Types.NULL);
			        else pstmt.setDate(33, convertdate(j.getClearing_date()));
			        if (j.getClearing_date_norm()==null) pstmt.setNull(34, Types.NULL);
			        else pstmt.setDate(34, convertdate(j.getClearing_date_norm()));
			   
			        
			        if (j.getReason_code()==null) pstmt.setNull(35, Types.NULL);
					else pstmt.setString(35, j.getReason_code());
			        
			        if (j.getIsOpen()==0) pstmt.setNull(36, Types.NULL);
			        else pstmt.setInt(36, j.getIsOpen());
			        if (j.getDiscount_due_date_norm()==null) pstmt.setNull(37, Types.NULL);
			        else pstmt.setDate(37, convertdate(j.getDiscount_due_date_norm()));
			        if (j.getDebit_credit_indicator()==null) pstmt.setNull(38, Types.NULL);
			        else pstmt.setString(38, j.getDebit_credit_indicator());
			        if (j.getPayment_method()==null) pstmt.setNull(39, Types.NULL);
			        else pstmt.setString(39, j.getPayment_method());
			        if (j.getDocument_creation_date()==null) pstmt.setNull(40, Types.NULL);
			        else pstmt.setDate(40, convertdate(j.getDocument_creation_date()));
			        pstmt.setFloat(41, j.getInvoice_amount_doc_currency());
			        if (j.getDocument_id()==0) pstmt.setNull(42, Types.NULL);
			        else pstmt.setInt(42, j.getDocument_id());
			        pstmt.setFloat(43, j.getActual_open_amount());
			        pstmt.setFloat(44, j.getPaid_amount());
			        if (j.getDayspast_due()==0) pstmt.setNull(45, Types.NULL);
			        else pstmt.setInt(45, j.getDayspast_due());
			        if (j.getInvoice_age()==0) pstmt.setNull(46, Types.NULL);
			        else pstmt.setInt(46, j.getInvoice_age());
			        pstmt.setFloat(47, j.getDisputed_amount());
			        //int rowsAffected = pstmt.executeUpdate();
			        pstmt.addBatch();
			    	if(++count % batchSize == 0) {
			    		pstmt.executeBatch();
			    	}
				 
		        //rs = pstmt.executeUpdate();
			    	//int rowsAffected = pstmt.executeUpdate();
			}
			pstmt.executeBatch();
			//while(rs.next())  
			//System.out.println(rs.getInt(1));  
			//ResultSet rs = pstmt.executeQuery();
			  
			}
			catch(Exception e)
				{ 
				System.err.println("An Exception was caught!");
				e.printStackTrace(); 
				}
		finally {
			try {
				br.close();
				dbCon.close();
			}
			catch(IOException | SQLException e) {
				System.err.println("An Exception was caught!");
				e.printStackTrace(); 
			}
		}
	}

}