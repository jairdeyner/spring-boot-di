package com.bolsadeideas.springboot.di.app.models.services;

// import org.springframework.stereotype.Component;

// @Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

  @Override
  public String operacion() {
    return "Ejecutando algún proceso importante complicado...";
  }
}
