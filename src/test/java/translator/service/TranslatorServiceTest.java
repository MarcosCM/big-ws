package translator.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import translator.Application;
import translator.domain.TranslatedText;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TranslatorServiceTest {

    @Autowired
    TranslatorService translatorService;
    @Test
    public void translateTest() throws Exception {
        TranslatedText translatedText = translatorService.translate("en", "es", "Santa Cruz Xoxocotlan is a small city and municipality located 5 km from the state capital of Oaxaca in the south of Mexico");
        assertEquals("Santa Cruz Xoxocotlan es una pequeña ciudad y municipio situado a 5 km de la capital del estado de Oaxaca, en el sur de México",translatedText.getTranslation());
    }

}
