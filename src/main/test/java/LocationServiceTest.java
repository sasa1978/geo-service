import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocationServiceTest {
    @Test
    void test_locationServiceTest_success() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, localizationService.locale(Country.RUSSIA));

        expected = "Welcome";
        Assertions.assertEquals(expected, localizationService.locale(Country.USA));

    }
}
