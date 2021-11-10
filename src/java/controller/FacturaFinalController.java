package controller;

import cajadelUnapec.FacturaFinal;
import facade.FacturaFinalFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "facturaFinalController")
@ViewScoped
public class FacturaFinalController extends AbstractController<FacturaFinal> {

    @Inject
    private MobilePageController mobilePageController;

    public FacturaFinalController() {
        // Inform the Abstract parent controller of the concrete FacturaFinal Entity
        super(FacturaFinal.class);
    }

}
