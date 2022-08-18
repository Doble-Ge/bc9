package desafio.grupo3.pages.hoteles;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class HomePageHoteles extends SeleniumWrapper {
    public HomePageHoteles(WebDriver driver) {
        super(driver);
    }

    //Locator

    By titleh4Locator = By.xpath("//div[@data-kind='hub-microsite-text']/descendant::h4/span");
    /*By alojamientoLocator = By.id("mui-1");
    By despleglabeAlojamientoLocator = By.id("mui-1-listbox");
    By primeraOpcionAlojamientoLocator = By.id("mui-1-option-0");
    By segundaOpcionAlojamientoLocator = By.id("mui-1-option-1");

    By btnCalendarioEntradaLocator = By.xpath("(//div [@class = 'display-pfh0xi']/button)[1]");
    By btnCalendarioSalidaLocator = By.xpath("(//div [@class = 'display-pfh0xi']/button)[2]");
    By btnDiaEntradaLocator = By.xpath("//div [@aria-labelledby = '7']/descendant::button[text()='22']");
    By btnDiaSalidaLocator = By.xpath("//div [@aria-labelledby = '7']/descendant::button[text()='25']");

    By pasajeroLocator = By.xpath("//div [@class = 'display-1j5hrwi']");
    By btnAdultoMenosLocarto = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[1]");
    By btnAdultoMasLocator = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[2]");
    By btnNinosMenosLocator = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[3]");
    By btnNinosMasLocator = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[4]");

    By btnAnadirHabitacionLocator = By.xpath("//div [@class = 'display-16gxy4x']/button");

    //Locator habitacion 2
    By btnSegundaAdultoMenosLocarto = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[5]");
    By btnSegundaAdultoMasLocator = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[6]");
    By btnSegundaNinosMenosLocator = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[7]");
    By btnSegundaNinosMasLocator = By.xpath("(//div [@class = 'display-ylvzma-Counter-styled']/button)[8]");

    By btnBuscarLocator = By.xpath("//div [@class = 'display-1jqt24b']/button");*/


    //Locator Hoteles mas Deseados

    /*By hotelesMadridLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::a[1]");
    By hotelesMadridValorLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::p[2]");

    By hotelesBarcelonaLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::a[2]");
    By hotelesBarcelonaValorLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::p[4]");

    By hotelesValenciaLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::a[3]");
    By hotelesValenciaValorLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::p[6]");

    By hotelesGranadaLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::a[4]");
    By hotelesGranadaValorLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::p[8]");

    By hotelesAndorraLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::a[5]");
    By hotelesAndorraValorLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::p[10]");

    By hotelesIbizaLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::a[6]");
    By hotelesIbizaValorLocator = By.xpath("(//div [@class = 'hub-col-md-12 hub-col-12 hub-col display-1l4c07p-Column-styles-Column-styles e1i8mjyc0'])[8]/descendant::p[12]");*/

    //localizadores ofertas
    By listadoOfertasTituloLocator = By.xpath("//a[@class=\"display-1jpjtw4-HubAnchor-styles e89md6u0\"]/descendant::h4[contains(text(),\"Hoteles en\")]");
    By listadoOfertasPrecioLocator = By.xpath("//a[@class=\"display-1jpjtw4-HubAnchor-styles e89md6u0\"]/descendant::p[@class=\"display-exp40l-HubFeatureCard-styled e1apqt30\"][contains(text(),\"Desde\")]");
    OfertasPageHoteles ofertasPageHoteles;
    private List<String> xpathsTitulos(){
        List<String> xpathOfertasTitulos = new ArrayList<>();
        List<WebElement> ofertas = findElements(listadoOfertasTituloLocator);
        for (int i=1; i<=ofertas.size();i++){
        String xpath = "(//a[@class=\"display-1jpjtw4-HubAnchor-styles e89md6u0\"]/descendant::h4[contains(text(),\"Hoteles en\")])["+i+"]";
        xpathOfertasTitulos.add(xpath);
        }

        return xpathOfertasTitulos;
    }
    private List<String> xpathsPrecios(){
        List<String> xpathOfertasPrecios = new ArrayList<>();
        List<WebElement> ofertas = findElements(listadoOfertasPrecioLocator);
        for (int i=1; i<=ofertas.size();i++){
            String xpath = "(//a[@class=\"display-1jpjtw4-HubAnchor-styles e89md6u0\"]/descendant::p[@class=\"display-exp40l-HubFeatureCard-styled e1apqt30\"][contains(text(),\"Desde\")])["+i+"]";
            xpathOfertasPrecios.add(xpath);
        }

        return xpathOfertasPrecios;
    }
    public String titleh4(){
        return getText(titleh4Locator);
    }
    private List<By> byArrayTitulos(){
        List<String> xpaths = xpathsTitulos();
        List<By> locatorsTitulos = new ArrayList<>();
        for (int i=0;i<xpaths.size();i++) {
            locatorsTitulos.add(By.xpath(xpaths.get(i)));
        }
        return locatorsTitulos;
    }
    private List<By> byArrayPrecios(){
        List<String> xpaths = xpathsPrecios();
        List<By> locatorsPrecios = new ArrayList<>();
        for (int i=0;i<xpaths.size();i++) {
            locatorsPrecios.add(By.xpath(xpaths.get(i)));
        }
        return locatorsPrecios;
    }
    public List<String> obtenerTitulosyPrecios(HomePageHoteles driver){
        List<By> locatorsTitulos = byArrayTitulos();
        List<By> locatorsPrecios = byArrayPrecios();
        List<String> esperados = new ArrayList<>();
        List<String> resultados = new ArrayList<>();
        ofertasPageHoteles = new OfertasPageHoteles(DriverFactory.getDriver());

        for(int i=0;i< locatorsTitulos.size();i++){
            String titulo = (getText(locatorsTitulos.get(i))).toLowerCase();
            String precio = (getText(locatorsPrecios.get(i))).toLowerCase();
            String esperado =  titulo +" "+ precio;
            esperados.add(esperado);
            click(locatorsTitulos.get(i));
            List<String> pestanas = driver.getTabsG3();
            driver.switchToG3(pestanas.get(pestanas.size()-1));
            String resultado= ofertasPageHoteles.resultado();
            if(esperado == resultado){resultados.add("true");}
            else {resultados.add("false");}
            driver.closeWindowsG3();
            driver.switchToG3(pestanas.get(0));

        }
        return resultados;
    }

}
