package co.com.bancolombia.certificacion.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;

public class GoTo implements Task {
	
	private Target googleTranslate;
	
	public GoTo (Target googleTranslate) {
		this.googleTranslate= googleTranslate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAJE_TEXTAREA),
				Enter.theValue("cheese").into(GoogleTranslatePage.SOURCE_LANGUAJE_TEXTAREA));
		
				
				//EnsureFieldVisible.ensureThat(actor).canSee(GoogleAppsComponent.GOOGLE_TRANSLATE);
						//Click.on(GoogleAppsComponent.GOOGLE_TRANSLATE));
			
		//googleApp.resolveFor(actor).isVisible();
				//googleApp.resolveFor(actor).waitUntilVisible();		
				//open,click,enter,hit
		
	}

	public static GoTo theApp(Target googleTranslate) {
		
		return instrumented(GoTo.class, googleTranslate) ;
	}

}
