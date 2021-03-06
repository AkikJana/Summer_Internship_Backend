package com.higradius;
import java.io.*;

import java.util.*;
import java.sql.*;
import java.util.Date;
public class employee_invoice {
	private int pk_id;
	private Integer acct_doc_header_id;
	private int company_id;
	private int document_number;
	private int document_number_norm;
	private String business_code;
	private String create_year;
	private int document_line_number;
	private String doctype;
	private int customer_number;
	private int customer_number_norm;
	private int fk_customer_map_id;
	private String customer_name;
	private String division;
	private Date document_create_date;
	private Date document_create_date_norm;
	private Date posting_date;
	private Date posting_date_norm;
	private String posting_id;
	private Date due_date;
	private Date due_date_norm;
	private Date order_date;
	private Date order_date_norm;
	private int invoice_id;
	private int invoice_id_norm;
	private Date baseline_create_date;
	private Date invoice_date_norm;
	private float total_open_amount;
	private float total_open_amount_norm;
	private int cust_payment_terms;
	private String business_area;
	private Date ship_date;
	private String ship_to;
	private Date clearing_date;

	private Date clearing_date_norm;
	private String reason_code;
	private int isOpen;
	private Date discount_due_date_norm;
	private String debit_credit_indicator;
	private String payment_method;
	private Date document_creation_date;
	private float invoice_amount_doc_currency;
	private int document_id;
	private float actual_open_amount;
	private float paid_amount;
	private int dayspast_due;
	private int invoice_age;
	private float disputed_amount;
	
	public employee_invoice() {
	}
	public employee_invoice(int pk_id,int acct_doc_header_id, int company_id, int document_number, int document_number_norm,
			String business_code, String create_year, int document_line_number, String doctype, int customer_number,
			int customer_number_norm, int fk_customer_map_id, String customer_name, String division,
			Date document_create_date, Date document_create_date_norm, Date posting_date, Date posting_date_norm,
			String posting_id, Date due_date, Date due_date_norm, Date order_date, Date order_date_norm, int invoice_id,
			int invoice_id_norm, Date baseline_create_date, Date invoice_date_norm, float total_open_amount,
			float total_open_amount_norm, int cust_payment_terms, String business_area, Date ship_date, String ship_to,
			Date clearing_date, Date clearing_date_norm, String reason_code, int isOpen, Date discount_due_date_norm,
			String debit_credit_indicator, String payment_method, Date document_creation_date,
			float invoice_amount_doc_currency, int document_id, float actual_open_amount, float paid_amount,
			int dayspast_due, int invoice_age, float disputed_amount) {
		this.pk_id=pk_id;
		this.acct_doc_header_id = acct_doc_header_id;
		this.company_id = company_id;
		this.document_number = document_number;
		this.document_number_norm = document_number_norm;
		this.business_code = business_code;
		this.create_year = create_year;
		this.document_line_number = document_line_number;
		this.doctype = doctype;
		this.customer_number = customer_number;
		this.customer_number_norm = customer_number_norm;
		this.fk_customer_map_id = fk_customer_map_id;
		this.customer_name = customer_name;
		this.division = division;
		this.document_create_date = document_create_date;
		this.document_create_date_norm = document_create_date_norm;
		this.posting_date = posting_date;
		this.posting_date_norm = posting_date_norm;
		this.posting_id = posting_id;
		this.due_date = due_date;
		this.due_date_norm = due_date_norm;
		this.order_date = order_date;
		this.order_date_norm = order_date_norm;
		this.invoice_id = invoice_id;
		this.invoice_id_norm = invoice_id_norm;
		this.baseline_create_date = baseline_create_date;
		this.invoice_date_norm = invoice_date_norm;
		this.total_open_amount = total_open_amount;
		this.total_open_amount_norm = total_open_amount_norm;
		this.cust_payment_terms = cust_payment_terms;
		this.business_area = business_area;
		this.ship_date = ship_date;
		this.ship_to = ship_to;
		this.clearing_date = clearing_date;
		this.clearing_date_norm = clearing_date_norm;
		this.reason_code = reason_code;
		this.isOpen = isOpen;
		this.discount_due_date_norm = discount_due_date_norm;
		this.debit_credit_indicator = debit_credit_indicator;
		this.payment_method = payment_method;
		this.document_creation_date = document_creation_date;
		this.invoice_amount_doc_currency = invoice_amount_doc_currency;
		this.document_id = document_id;
		this.actual_open_amount = actual_open_amount;
		this.paid_amount = paid_amount;
		this.dayspast_due = dayspast_due;
		this.invoice_age = invoice_age;
		this.disputed_amount = disputed_amount;
		
	}
	public int getAcct_doc_header_id() {
		return acct_doc_header_id;
	}
	public float getActual_open_amount() {
		return actual_open_amount;
	}
	public Date getBaseline_create_date() {
		return baseline_create_date;
	}
	public String getBusiness_area() {
		return business_area;
	}
	public String getBusiness_code() {
		return business_code;
	}
	public Date getClearing_date() {
		return clearing_date;
	}
	public Date getClearing_date_norm() {
		return clearing_date_norm;
	}
	public int getCompany_id() {
		return company_id;
	}
	public String getCreate_year() {
		return create_year;
	}
	public int getCust_payment_terms() {
		return cust_payment_terms;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public int getCustomer_number() {
		return customer_number;
	}
	public int getCustomer_number_norm() {
		return customer_number_norm;
	}
	public int getDayspast_due() {
		return dayspast_due;
	}
	public String getDebit_credit_indicator() {
		return debit_credit_indicator;
	}
	public Date getDiscount_due_date_norm() {
		return discount_due_date_norm;
	}
	public float getDisputed_amount() {
		return disputed_amount;
	}
	public String getDivision() {
		return division;
	}
	public String getDoctype() {
		return doctype;
	}
	public Date getDocument_create_date() {
		return document_create_date;
	}
	public Date getDocument_create_date_norm() {
		return document_create_date_norm;
	}
	public Date getDocument_creation_date() {
		return document_creation_date;
	}
	public int getDocument_id() {
		return document_id;
	}
	public int getDocument_line_number() {
		return document_line_number;
	}
	public int getDocument_number() {
		return document_number;
	}
	public int getDocument_number_norm() {
		return document_number_norm;
	}
	public Date getDue_date() {
		return due_date;
	}
	public Date getDue_date_norm() {
		return due_date_norm;
	}
	public int getFk_customer_map_id() {
		return fk_customer_map_id;
	}
	public int getInvoice_age() {
		return invoice_age;
	}
	public float getInvoice_amount_doc_currency() {
		return invoice_amount_doc_currency;
	}
	public Date getInvoice_date_norm() {
		return invoice_date_norm;
	}
	public int getInvoice_id() {
		return invoice_id;
	}
	public int getInvoice_id_norm() {
		return invoice_id_norm;
	}
	public int getIsOpen() {
		return isOpen;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public Date getOrder_date_norm() {
		return order_date_norm;
	}
	public float getPaid_amount() {
		return paid_amount;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public int getPk_id() {
		return pk_id;
	}
	public Date getPosting_date() {
		return posting_date;
	}
	public Date getPosting_date_norm() {
		return posting_date_norm;
	}
	public String getPosting_id() {
		return posting_id;
	}
	public String getReason_code() {
		return reason_code;
	}
	public Date getShip_date() {
		return ship_date;
	}
	public String getShip_to() {
		return ship_to;
	}
	public float getTotal_open_amount() {
		return total_open_amount;
	}
	public float getTotal_open_amount_norm() {
		return total_open_amount_norm;
	}
	public void setAcct_doc_header_id(int acct_doc_header_id) {
		this.acct_doc_header_id = acct_doc_header_id;
	}
	public void setActual_open_amount(float actual_open_amount) {
		this.actual_open_amount = actual_open_amount;
	}
	public void setBaseline_create_date(Date baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}
	public void setBusiness_area(String business_area) {
		this.business_area = business_area;
	}
	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}
	public void setClearing_date(Date clearing_date) {
		this.clearing_date = clearing_date;
	}
	public void setClearing_date_norm(Date clearing_date_norm) {
		this.clearing_date_norm = clearing_date_norm;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public void setCreate_year(String create_year) {
		this.create_year = create_year;
	}
	public void setCust_payment_terms(int cust_payment_terms) {
		this.cust_payment_terms = cust_payment_terms;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public void setCustomer_number_norm(int customer_number_norm) {
		this.customer_number_norm = customer_number_norm;
	}
	public void setDayspast_due(int dayspast_due) {
		this.dayspast_due = dayspast_due;
	}
	public void setDebit_credit_indicator(String debit_credit_indicator) {
		this.debit_credit_indicator = debit_credit_indicator;
	}
	public void setDiscount_due_date_norm(Date discount_due_date_norm) {
		this.discount_due_date_norm = discount_due_date_norm;
	}
	public void setDisputed_amount(float disputed_amount) {
		this.disputed_amount = disputed_amount;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public void setDocument_create_date(Date document_create_date) {
		this.document_create_date = document_create_date;
	}
	public void setDocument_create_date_norm(Date document_create_date_norm) {
		this.document_create_date_norm = document_create_date_norm;
	}
	public void setDocument_creation_date(Date document_creation_date) {
		this.document_creation_date = document_creation_date;
	}
	public void setDocument_id(int document_id) {
		this.document_id = document_id;
	}
	public void setDocument_line_number(int document_line_number) {
		this.document_line_number = document_line_number;
	}
	public void setDocument_number(int document_number) {
		this.document_number = document_number;
	}
	public void setDocument_number_norm(int document_number_norm) {
		this.document_number_norm = document_number_norm;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public void setDue_date_norm(Date due_date_norm) {
		this.due_date_norm = due_date_norm;
	}
	public void setFk_customer_map_id(int fk_customer_map_id) {
		this.fk_customer_map_id = fk_customer_map_id;
	}
	public void setInvoice_age(int invoice_age) {
		this.invoice_age = invoice_age;
	}
	public void setInvoice_amount_doc_currency(float invoice_amount_doc_currency) {
		this.invoice_amount_doc_currency = invoice_amount_doc_currency;
	}
	public void setInvoice_date_norm(Date invoice_date_norm) {
		this.invoice_date_norm = invoice_date_norm;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public void setInvoice_id_norm(int invoice_id_norm) {
		this.invoice_id_norm = invoice_id_norm;
	}
	public void setIsOpen(int isOpen) {
		this.isOpen = isOpen;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public void setOrder_date_norm(Date order_date_norm) {
		this.order_date_norm = order_date_norm;
	}
	public void setPaid_amount(float paid_amount) {
		this.paid_amount = paid_amount;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}
	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}
	public void setPosting_date_norm(Date posting_date_norm) {
		this.posting_date_norm = posting_date_norm;
	}
	public void setPosting_id(String posting_id) {
		this.posting_id = posting_id;
	}
	public void setReason_code(String reason_code) {
		this.reason_code = reason_code;
	}
	public void setShip_date(Date ship_date) {
		this.ship_date = ship_date;
	}
	public void setShip_to(String ship_to) {
		this.ship_to = ship_to;
	}
	public void setTotal_open_amount(float total_open_amount) {
		this.total_open_amount = total_open_amount;
	}
	public void setTotal_open_amount_norm(float total_open_amount_norm) {
		this.total_open_amount_norm = total_open_amount_norm;
	}
}
