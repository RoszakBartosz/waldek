package org.roszak.asocjacje.zadanie2;

import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Invoice {
    private Double price;
    private LocalDate localDate;
    private Company company;
    private static List<Invoice> invoiceList = new ArrayList<>();


    public Invoice(Double price, LocalDate localDate, Company company) {
        this.price = price;
        this.localDate = localDate;
        this.company = company;
        invoiceList.add(this);
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Company getCompany() {
        return company;
    }

    public static List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(price, invoice.price) && Objects.equals(localDate, invoice.localDate) && Objects.equals(company, invoice.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, localDate, company);
    }

    public static double sumOfInvoicesPrice(List<Invoice> invoices){
        double sum = invoices.stream().mapToDouble(i -> i.getPrice()).sum();
        return sum;
    }

    public static DayOfWeek ReturnWhenMostInvoices(List<Invoice> invoices){
        int howMuchInvoices = 0;

        Map<DayOfWeek, List<Invoice>> dayOfWeekListMap = invoices
                .stream()
                .collect(Collectors.groupingBy(s -> s.getLocalDate()
                        .getDayOfWeek()
        ));
        Map.Entry<DayOfWeek, List<Invoice>> dayOfWeekListEntry = dayOfWeekListMap
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(s -> s.getValue().size()))
                .get();
        return dayOfWeekListEntry.getKey();
    }
}
