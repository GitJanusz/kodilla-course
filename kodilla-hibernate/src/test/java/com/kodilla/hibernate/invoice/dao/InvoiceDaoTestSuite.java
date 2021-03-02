package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product");
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Item item = new Item(new BigDecimal(10), 1, new BigDecimal(10));
        Item item1 = new Item(new BigDecimal(10), 2, new BigDecimal(20));
        Item item2 = new Item(new BigDecimal(25), 4, new BigDecimal(100));
        Item item3 = new Item(new BigDecimal(30), 2, new BigDecimal(60));
        Item item4 = new Item(new BigDecimal(30), 1, new BigDecimal(30));
        item.setProduct(product);
        item1.setProduct(product);
        item2.setProduct(product1);
        item3.setProduct(product2);
        item4.setProduct(product2);
        Invoice invoice = new Invoice("1");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        assertNotEquals(0, id);
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
