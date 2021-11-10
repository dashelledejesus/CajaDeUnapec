package controller;

import cajadelUnapec.Empleado;
import facade.EmpleadoFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "empleadoController")
@ViewScoped
public class EmpleadoController extends AbstractController<Empleado> {

    @Inject
    private MobilePageController mobilePageController;

    public EmpleadoController() {
        // Inform the Abstract parent controller of the concrete Empleado Entity
        super(Empleado.class);
    }

}
