package com.example.root.guardarinfo2;

/**
 * Created by root on 12/14/17.
 */

public class Contact {

    int _id;
    String _name;
    String _phone_number;

    public Contact(){

    }

    public Contact(int id, String name, String _phone_number){
        this._id=id;
        this._name=name;
        this._phone_number=_phone_number;
    }

    public Contact(String name, String _phone_number){
        this._name=name;
        this._phone_number=_phone_number;
    }
    //obtener elID

    public int getID(){
        return this._id;
    }

    //definir elID

    public void setID(int id){
        this._id=id;
    }

    //obtener el nombre
    public String getName(){
        return this._name;
    }

    //definir el nombre
    public void setName(String name){
        this._name=name;
    }
    //obtener el número de teléfono
    public String getPhoneNumber(){
        return this._phone_number;
    }
    //establecer el númerode teléfono
    public void setPhoneNumber(String phone_number){
        this._phone_number=phone_number;
    }

}