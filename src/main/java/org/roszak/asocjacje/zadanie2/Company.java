package org.roszak.asocjacje.zadanie2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Company {
    private static List<Company> companyList = new ArrayList<>();
    private String name;
    private String nip;
    private List<Invoice> invoices = new ArrayList<>();

    public Company(String name, String nip) {
        this.name = name;
        this.nip = nip;
        companyList.add(this);
    }

    public static List<Company> getCompanyList() {
        return companyList;
    }

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", nip='" + nip +"}";
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }
    public static Company returnHighestCompany(){
        Company max = companyList
                .stream()
                .max(Comparator.comparingDouble(i -> Invoice
                        .sumOfInvoicesPrice(i.getInvoices()))).get();
    return max;
    }
    public void returnMuchInvoice(Company company){
        

    }

}
