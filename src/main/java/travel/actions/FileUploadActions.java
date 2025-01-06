package travel.actions;
import travel.elements.FileUploadElements;
import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class FileUploadActions extends FileUploadElements {

    public void uploadFileClick(){
        File file = chooseFileButton.uploadFile(new File("C:\\Users\\anakhurtsidze\\Desktop\\ana_khurtsidze_final_task\\build\\downloads\\1736018467549_12100_1\\invoice.pdf"));
    }

    public void clickSubmitButton(){
        submitButton.click();
        submitButton.shouldBe(visible, Duration.ofSeconds(15));
    }
}
