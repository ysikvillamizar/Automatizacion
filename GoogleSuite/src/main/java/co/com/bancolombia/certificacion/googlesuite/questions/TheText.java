package co.com.bancolombia.certificacion.googlesuite.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheText implements Question<String >{
	
	private Target target;

	public TheText(Target target) {
		super();
		this.target = target;
	}
	
	  public static TheText ofFollowingTarget(Target target) {
	        return new TheText(target);
	    }


	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(target).viewedBy(actor).asString();
	}
	
	

}
