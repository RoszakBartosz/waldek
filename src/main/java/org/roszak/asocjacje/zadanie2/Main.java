package org.roszak.asocjacje.zadanie2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        2. Mamy klaske firma(nazwa, nip) i klaske faktura(cena, data)
//        -znajdz firme ktora ma najwieszke obroty w lutym
        Company bjEducation = new Company("BJEducation", "87782");
        LocalDate localDate = LocalDate.of(2024, 1, 2);
        LocalDate localDate1 = LocalDate.of(2024, 1, 15);
        new Invoice(47.00, localDate, bjEducation);
        new Invoice(33.00, localDate, bjEducation);
        new Invoice(754.00, localDate, bjEducation);
        new Invoice(1212.00, localDate, bjEducation);
        new Invoice(755.00, localDate, bjEducation);
        new Invoice(98.00, localDate1, bjEducation);
        new Invoice(12.00, localDate1, bjEducation);
        new Invoice(98.00, localDate1, bjEducation);


        Company dembeleTech = new Company("DembeleTech", "28493");
        new Invoice(423.00, localDate1, dembeleTech);
        new Invoice(17.00, localDate1, dembeleTech);
        new Invoice(22.00, localDate1, dembeleTech);
        new Invoice(77.00, localDate1, dembeleTech);

        List<Company> companyList = Company.getCompanyList();
        Company company = Company.returnHighestCompany();
        System.out.println(company);

        //        -w ktory dzien tygodnia wystawiono najwiecej faktur
         List<Invoice> invoiceList = Invoice.getInvoiceList();
        DayOfWeek dayOfWeek = Invoice.ReturnWhenMostInvoices(invoiceList);
        System.out.println(dayOfWeek);


//        zauwaz ze jest to kompozycja, faktura nie moze istniec bez firmy, ale firma bez faktury tak


    }
}
