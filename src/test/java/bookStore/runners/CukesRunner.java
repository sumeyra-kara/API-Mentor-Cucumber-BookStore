package bookStore.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "bookStore/step_defs",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
/**
 * /*
 *         Runner class'lari istenen feature ve/veya Scenario'larin
 *         toplu olarak calistirilabilmesi icin kullanilir
 *
 *         Runner class'larinin ici bostur
 *         Runner class'inin islevini gerceklestiren
 *         kullanacagimiz 2 adet notasyondur
 *
 *         @RunWith notasyonu ile Runner'in hangi class ile calistirilmasini istedigimizi belirtiriz
 *
 *         @CucumberOptions ise hangi feature dosyalarini ve
 *         hangi stepdefinition class'larini kullanacagimizi,
 *         hangi Feature ve/veya Scenario'larin calistirilacagini belirlemek icin kullanilir
 *
 *         dryRun = true oldugunda, verilen tag'a sahip
 *         feature ve/veya scenario'lari kontrol edip
 *         eksik step varsa onlari bize raporlar,
 *         eksik step yoksa bunu bize belirtmek icin testi calistirmadan test passed diye raporlar
 *
 *         istedigimiz tag'a sahip feature'larin normal olarak calistirilmasi icin
 *         dryRun = false olmalidir
 *      */
