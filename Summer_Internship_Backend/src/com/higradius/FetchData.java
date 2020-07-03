package com.higradius;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;


public class FetchData {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                //Properties prop = new Properties();
                //InputStream inputStream = FetchData.class.getClassLoader().getResourceAsStream("/db.properties");
                //prop.load(inputStream);
                //String driver = prop.getProperty("driver");
                //String url = prop.getProperty("url");
                //String user = prop.getProperty("user");
                //String password = prop.getProperty("password");
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root"); 
                //connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

    }
    
    public static ArrayList<employee_invoice> getAllInvoices(String url) {
     connection = FetchData.getConnection();
        ArrayList<employee_invoice>invoiceList = new ArrayList<employee_invoice>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(url);
            //ResultSet rs = statement.executeQuery("Select pk_id,acct_doc_header_id,company_id,document_number,document_number_norm,business_code,create_year,document_line_number,doctype,customer_number,customer_number_norm,fk_customer_map_id,customer_name,division,document_create_date,document_create_date_norm,posting_date,posting_date_norm,posting_id,due_date,due_date_norm,order_date,order_date_norm,invoice_id,invoice_id_norm,baseline_create_date,invoice_date_norm,total_open_amount,total_open_amount_norm,cust_payment_terms,business_area,ship_date,ship_to,clearing_date,clearing_date_norm,reason_code,isOpen,discount_due_date_norm,debit_credit_indicator,payment_method,document_creation_date,invoice_amount_doc_currency,document_id,actual_open_amount,paid_amount,dayspast_due,invoice_age,disputed_amount from customer_invoice Limit 100");
            while(rs.next()) { 
             employee_invoice tmp=new employee_invoice();
             //tmp.setPk_id(rs.getInt(0));
             tmp.setPk_id(rs.getInt(1));
             tmp.setAcct_doc_header_id(rs.getInt(2));
           tmp.setCompany_id(rs.getInt(3));
           tmp.setDocument_number(rs.getInt(4));
           tmp.setDocument_number_norm(rs.getInt(5));
           tmp.setBusiness_code(rs.getString(6));
           tmp.setCreate_year(rs.getString(7)); 
           tmp.setDocument_line_number(rs.getInt(8));
           tmp.setDoctype(rs.getString(9)); 
           tmp.setCustomer_number(rs.getInt(10));
           tmp.setCustomer_number_norm (rs.getInt(11));
           tmp.setFk_customer_map_id(rs.getInt(12));
           tmp.setCustomer_name(rs.getString(13));
           tmp.setDivision(rs.getString(14));
           tmp.setDocument_create_date(rs.getDate(15));
           tmp.setDocument_create_date_norm(rs.getDate(16));
           tmp.setPosting_date(rs.getDate(17));
           tmp.setPosting_date_norm(rs.getDate(18));
           tmp.setPosting_id(rs.getString(19)); 
           tmp.setDue_date(rs.getDate(20));
           tmp.setDue_date_norm(rs.getDate(21));
           tmp.setOrder_date(rs.getDate(22));        
           tmp.setOrder_date_norm(rs.getDate(23));
           tmp.setInvoice_id(rs.getInt(24));
           tmp.setInvoice_id_norm(rs.getInt(25));
           tmp.setBaseline_create_date(rs.getDate(26));
           tmp.setInvoice_date_norm(rs.getDate(27));
           tmp.setTotal_open_amount(rs.getFloat(28));
           tmp.setTotal_open_amount_norm(rs.getFloat(29));
           tmp.setCust_payment_terms(rs.getInt(30));
           tmp.setBusiness_area(rs.getString(31)); 
           tmp.setShip_date(rs.getDate(32));
           tmp.setShip_to(rs.getString(33));
           tmp.setClearing_date(rs.getDate(34));
           tmp.setClearing_date_norm(rs.getDate(35));
           tmp.setReason_code(rs.getString(36)); 
           tmp.setIsOpen(rs.getInt(37));
           tmp.setDiscount_due_date_norm(rs.getDate(38));
           tmp.setDebit_credit_indicator(rs.getString(39)); 
           tmp.setPayment_method(rs.getString(40));
           tmp.setDocument_creation_date(rs.getDate(41));
           tmp.setInvoice_amount_doc_currency (rs.getFloat(42));
           tmp.setDocument_id(rs.getInt(43));
           tmp.setActual_open_amount (rs.getFloat(44));
           tmp.setPaid_amount (rs.getFloat(45));
           tmp.setDayspast_due(rs.getInt(46));
           tmp.setInvoice_age(rs.getInt(47));
           tmp.setDisputed_amount(rs.getFloat(48));

             /*tmp.setAcct_doc_header_id(rs.getInt(1));
       	  tmp.setCompany_id(rs.getInt(2));
       	  tmp.setDocument_number(rs.getInt(3));
       	  tmp.setDocument_number_norm(rs.getInt(4));
       	  tmp.setBusiness_code(rs.getString(5));
       	  tmp.setCreate_year(rs.getString(6)); 
       	  tmp.setDocument_line_number(rs.getInt(7));
       	  tmp.setDoctype(rs.getString(8)); 
       	  tmp.setCustomer_number(rs.getInt(9));
       	  tmp.setCustomer_number_norm (rs.getInt(10));
       	  tmp.setFk_customer_map_id(rs.getInt(11));
       	  tmp.setCustomer_name(rs.getString(12));
       	  tmp.setDivision(rs.getString(13));
       	  tmp.setDocument_create_date(rs.getDate(14));
       	  tmp.setDocument_create_date_norm(rs.getDate(15));
       	  tmp.setPosting_date(rs.getDate(16));
       	  tmp.setPosting_date_norm(rs.getDate(17));
       	  tmp.setPosting_id(rs.getString(18)); 
       	  tmp.setDue_date(rs.getDate(19));
       	  tmp.setDue_date_norm(rs.getDate(20));
       	  tmp.setOrder_date(rs.getDate(21));				
       	  tmp.setOrder_date_norm(rs.getDate(22));
       	  tmp.setInvoice_id(rs.getInt(23));
       	  tmp.setInvoice_id_norm(rs.getInt(24));
       	  tmp.setBaseline_create_date(rs.getDate(25));
       	  tmp.setInvoice_date_norm(rs.getDate(26));
       	  tmp.setTotal_open_amount(rs.getFloat(27));
       	  tmp.setTotal_open_amount_norm(rs.getFloat(28));
       	  tmp.setCust_payment_terms(rs.getInt(29));
       	  tmp.setBusiness_area(rs.getString(30)); 
       	  tmp.setShip_date(rs.getDate(31));
       	  tmp.setShip_to(rs.getString(32));
       	  tmp.setClearing_date(rs.getDate(33));
       	  tmp.setClearing_date_norm(rs.getDate(34));
       	  tmp.setReason_code(rs.getString(35)); 
       	  tmp.setIsOpen(rs.getInt(36));
       	  tmp.setDiscount_due_date_norm(rs.getDate(37));
       	  tmp.setDebit_credit_indicator(rs.getString(38)); 
       	  tmp.setPayment_method(rs.getString(39));
       	  tmp.setDocument_creation_date(rs.getDate(40));
       	  tmp.setInvoice_amount_doc_currency (rs.getFloat(41));
       	  tmp.setDocument_id(rs.getInt(42));
       	  tmp.setActual_open_amount (rs.getFloat(43));
       	  tmp.setPaid_amount (rs.getFloat(44));
       	  tmp.setDayspast_due(rs.getInt(45));
       	  tmp.setInvoice_age(rs.getInt(46));
       	  tmp.setDisputed_amount(rs.getFloat(47));*/
       	  invoiceList.add(tmp);
             //countryList.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invoiceList;
    }
}

