package controller;

import cajadelUnapec.TipoDocumento;
import facade.TipoDocumentoFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "tipoDocumentoController")
@ViewScoped
public class TipoDocumentoController extends AbstractController<TipoDocumento> {

    @Inject
    private MobilePageController mobilePageController;

    public TipoDocumentoController() {
        // Inform the Abstract parent controller of the concrete TipoDocumento Entity
        super(TipoDocumento.class);
    }

}
