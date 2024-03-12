/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Insumo;
import entity.Response;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 *
 * @author RobinsonConcha
 */
@WebService
public class ServicioInsumo {
   @WebMethod(action = "agregarInsumo")
public String agregarInsumo(int codigo, String nombre, int valor) {
    String salida;
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    Response r = new Response();
   //codigo aqui
    r.setStatus(200);
    r.setData("Agregado el insumo" + nombre);
    salida = gson.toJson(r);
    return salida;
} 
  @WebMethod(action = "modificarInsumo")
public String modificarInsumo(int codigo, String nombre, int valor) {
    String salida;
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    Response r = new Response();
    //codigo aqui
    r.setStatus(200);
    r.setData("Modificado el insumo" + codigo);
    salida = gson.toJson(r);
    return salida;
}
  @WebMethod(action = "eliminarInsumo")
public String eliminarInsumo(int codigo, String nombre, int valor) {
    String salida;
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    Response r = new Response();
    //codigo aqui
    r.setStatus(200);
    r.setData("Eliminado el insumo" + codigo);
    salida = gson.toJson(r);
    return salida;
}
  @WebMethod(action = "consultarInsumo")
public String consultarInsumo(int codigo, String nombre, int valor) {
    String salida;
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    Response r = new Response();
    //codigo aqui
    List array = new ArrayList();
    array.add(new entity.Insumo(1,"Clavo", 1));
    array.add(new entity.Insumo(2,"Martillo", 1000));
    array.add(new entity.Insumo(2,"Perno", 2));
    r.setStatus(200);
    r.setData(array);
    salida = gson.toJson(r);
    return salida;
  }
  @WebMethod(action = "consultarInsumoByCodigo")
public String consultarInsumoByCodigo(int codigo) {
    String salida;
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    Response r = new Response();
    //codigo aqui
    Insumo encontrado = null;
    if(codigo==1)
        encontrado = new entity.Insumo(1,"Clavo", 1);
    if(codigo==2)
        encontrado = new entity.Insumo(2,"Martillo", 1000);
    if(codigo==3)
        encontrado = new entity.Insumo(3, "Perno", 2);
    //simula que fue correcta la transacccion
    r.setStatus(200);
    r.setData(encontrado);
    salida = gson.toJson(r);
    return salida;
}
}