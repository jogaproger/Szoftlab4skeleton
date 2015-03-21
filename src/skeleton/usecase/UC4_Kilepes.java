package skeleton.usecase;

import modell.Jatek;
import skeleton.Logger;

public class UC4_Kilepes extends UseCase {

	@Override
	public void execute() {
            Logger.setEnabled(false);
            Jatek jatek = new Jatek();
            
            Logger.setEnabled(true);
            jatek.kilepes();

	}

	@Override
	public String getName() {
		return "Kilepes";
	}

}
