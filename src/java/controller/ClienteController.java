package controller;

import cajadelUnapec.Cliente;
import facade.ClienteFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "clienteController")
@ViewScoped
public class ClienteController extends AbstractController<Cliente> {

    @Inject
    private MobilePageController mobilePageController;

    public ClienteController() {
        // Inform the Abstract parent controller of the concrete Cliente Entity
        super(Cliente.class);
    }

}
