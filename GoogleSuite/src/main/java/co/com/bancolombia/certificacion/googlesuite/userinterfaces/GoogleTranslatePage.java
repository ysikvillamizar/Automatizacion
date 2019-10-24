package co.com.bancolombia.certificacion.googlesuite.userinterfaces;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {

	//public static final Target SOURCE_LANGUAJE =Target.the("Source language button").located(By.className("sl-more tlid-open-source-language-list"));
	//public static final Target TARGET_LANGUAJE=Target.the("Target language button").locatedBy("//*[@class='tl-more tlid-open-target-language-list']");
	//public static final Target SOURCE_LANGUAJE_OPTION=Target.the("Source language ").locatedBy("//*[@class='language_list_item_icon sl_list_en_checkmark']");
	//public static final Target TARGET_LANGUAJE_OPTION=Target.the("Target language ").locatedBy("//*[@class='language_list_item_icon tl_list_es_checkmark']");
	public static final Target SOURCE_LANGUAJE_TEXTAREA= Target.the("Sourse language textarea").located(By.id("source"));
	public static final Target TARGET_LANGUAJE_RESULT=Target.the("Target language result tarea").locatedBy("//*[@class='tlid-results-container results-container empty']");
}
