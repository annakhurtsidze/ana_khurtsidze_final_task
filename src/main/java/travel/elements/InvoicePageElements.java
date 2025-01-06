package travel.elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class InvoicePageElements {
    public SelenideElement

    invoiceQR = $("#InvoiceQR"),
    downloadInvoiceButton = $("button[onclick*='download_pdf()']");
}
