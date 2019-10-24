package co.com.bancolombia.certificacion.googlesuite.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;;

public class OpenTheBrowser implements Task{

	private PageObject page;
	
	//constructor o setter
	public OpenTheBrowser(PageObject page) {
		//dar valor al atributo
		this.page=page;
	}
	
	
	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static OpenTheBrowser on(PageObject page) {
		
		return instrumented(OpenTheBrowser.class, page);
		//Instrumented por debajo llama el contructor de la clase que se ajuste a los parametros
		//retun new OpenTheBrowser(page);
	}
	
	

}
