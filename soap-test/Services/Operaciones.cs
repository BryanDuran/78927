using System;
using WSDL.mensajes;



namespace WSDL.operaciones{

public class Operaciones : Mensajes{

public string Saludar(string nombre){

string msj = "Hola" +nombre+", te saluda bryan";
return msj;
}
public int  Mostrar(int id){
return 0;
}
}
}
