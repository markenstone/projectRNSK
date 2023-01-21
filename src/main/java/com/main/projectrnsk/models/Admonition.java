package com.main.projectrnsk.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "admonition")
public class Admonition {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "Customer")
    private String customer;

    @Column(name = "Name_object")
    private String nameObject;

    @Column(name = "Code_object")
    private int codeObject;

    @Column(name = "Perfomer")
    private String perfomer;

    @Column(name = "Type_work")
    private String typeWork;

    @Column(name = "Description")
    private String description;

    @Column(name = "Classification_description")
    private String classificationDescription;

    @Column(name = "Regulatory_documents")
    private  String regulatoryDocuments;

    @Column(name = "Number_description")
    private String numberDescription;

    @Column(name = "Type_description")
    private  String typeDescription;

    @Column(name = "Date_issue")
    private String dateIssue;

    @Column(name = "Correction_date_plan")
    private String correctionDatePlan;

    @Column(name = "Correction_date_fact")
    private String correctionDateFact;

    @Column(name = "Remedy_mark")
    private String remedyMark;

    @Column(name = "Late_not")
    private String lateNot;

    @Column(name = "Remedy_mark_final")
    private String remedyMarkFinal;

    @Column(name = "Employee")
    private  String employee;

    @Column(name = "Executor")
    private String executor;

    @Column(name = "Customer_representative")
    private  String customerRepresentative;


    public Admonition(){}

    public Admonition(String customer, String nameObject, int codeObject, String perfomer,
                      String typeWork, String description, String classificationDescription,
                      String regulatoryDocuments, String numberDescription, String typeDescription,
                       String remedyMark,
                      String lateNot, String remedyMarkFinal, String employee, String executor,
                      String customerRepresentative) {

        this.customer = customer;
        this.nameObject = nameObject;
        this.codeObject = codeObject;
        this.perfomer = perfomer;
        this.typeWork = typeWork;
        this.description = description;
        this.classificationDescription = classificationDescription;
        this.regulatoryDocuments = regulatoryDocuments;
        this.numberDescription = numberDescription;
        this.typeDescription = typeDescription;

        this.remedyMark = remedyMark;
        this.lateNot = lateNot;
        this.remedyMarkFinal = remedyMarkFinal;
        this.employee = employee;
        this.executor = executor;
        this.customerRepresentative = customerRepresentative;
    }

    @Override
    public String toString() {
        return "Admonition{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", nameObject='" + nameObject + '\'' +
                ", codeObject='" + codeObject + '\'' +
                ", perfomer='" + perfomer + '\'' +
                ", typeWork='" + typeWork + '\'' +
                ", description='" + description + '\'' +
                ", classificationDescription='" + classificationDescription + '\'' +
                ", regulatoryDocuments='" + regulatoryDocuments + '\'' +
                ", numberDescription='" + numberDescription + '\'' +
                ", typeDescription='" + typeDescription + '\'' +
                ", dateIssue=" + dateIssue +
                ", correctionDatePlan=" + correctionDatePlan +
                ", correctionDateFact=" + correctionDateFact +
                ", remedyMark='" + remedyMark + '\'' +
                ", lateNot='" + lateNot + '\'' +
                ", remedyMarkFinal='" + remedyMarkFinal + '\'' +
                ", employee='" + employee + '\'' +
                ", executor='" + executor + '\'' +
                ", customerRepresentative='" + customerRepresentative + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public int getCodeObject() {
        return codeObject;
    }

    public void setCodeObject(int codeObject) {
        this.codeObject = codeObject;
    }

    public String getPerfomer() {
        return perfomer;
    }

    public void setPerfomer(String perfomer) {
        this.perfomer = perfomer;
    }

    public String getTypeWork() {
        return typeWork;
    }

    public void setTypeWork(String typeWork) {
        this.typeWork = typeWork;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassificationDescription() {
        return classificationDescription;
    }

    public void setClassificationDescription(String classificationDescription) {
        this.classificationDescription = classificationDescription;
    }

    public String getRegulatoryDocuments() {
        return regulatoryDocuments;
    }

    public void setRegulatoryDocuments(String regulatoryDocuments) {
        this.regulatoryDocuments = regulatoryDocuments;
    }

    public String getNumberDescription() {
        return numberDescription;
    }

    public void setNumberDescription(String numberDescription) {
        this.numberDescription = numberDescription;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(String dateIssue) {
        this.dateIssue = dateIssue;
    }

    public String getCorrectionDatePlan() {
        return correctionDatePlan;
    }

    public void setCorrectionDatePlan(String correctionDatePlan) {
        this.correctionDatePlan = correctionDatePlan;
    }

    public String getCorrectionDateFact() {
        return correctionDateFact;
    }

    public void setCorrectionDateFact(String correctionDateFact) {
        this.correctionDateFact = correctionDateFact;
    }

    public String getRemedyMark() {
        return remedyMark;
    }

    public void setRemedyMark(String remedyMark) {
        this.remedyMark = remedyMark;
    }

    public String getLateNot() {
        return lateNot;
    }

    public void setLateNot(String lateNot) {
        this.lateNot = lateNot;
    }

    public String getRemedyMarkFinal() {
        return remedyMarkFinal;
    }

    public void setRemedyMarkFinal(String remedyMarkFinal) {
        this.remedyMarkFinal = remedyMarkFinal;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getCustomerRepresentative() {
        return customerRepresentative;
    }

    public void setCustomerRepresentative(String customerRepresentative) {
        this.customerRepresentative = customerRepresentative;
    }
}
