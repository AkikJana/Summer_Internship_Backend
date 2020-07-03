package com.higradius;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;


@WebServlet("/PopulateTable")
public class PopulateTable extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public PopulateTable() {
        
    }
 
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
  ArrayList<employee_invoice>invoice=new ArrayList<employee_invoice>();
  String url="Select pk_id,acct_doc_header_id,company_id,document_number,document_number_norm,business_code,create_year,document_line_number,doctype,customer_number,customer_number_norm,fk_customer_map_id,customer_name,division,document_create_date,document_create_date_norm,posting_date,posting_date_norm,posting_id,due_date,due_date_norm,order_date,order_date_norm,invoice_id,invoice_id_norm,baseline_create_date,invoice_date_norm,total_open_amount,total_open_amount_norm,cust_payment_terms,business_area,ship_date,ship_to,clearing_date,clearing_date_norm,reason_code,isOpen,discount_due_date_norm,debit_credit_indicator,payment_method,document_creation_date,invoice_amount_doc_currency,document_id,actual_open_amount,paid_amount,dayspast_due,invoice_age,disputed_amount from customer_invoice Limit 100";
  invoice=FetchData.getAllInvoices(url);
  Gson gson = new Gson();
  JsonElement element = gson.toJsonTree(invoice, new TypeToken<List<employee_invoice>>() {}.getType());

  JsonArray jsonArray = element.getAsJsonArray();
  response.setContentType("application/json");
  response.addHeader("access control allow origin", "http://localhost:3000/1705205");
  response.getWriter().print(jsonArray);
  
 }

 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
 }

}
