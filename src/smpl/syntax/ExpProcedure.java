package smpl.syntax;

import smpl.semantics.Visitor;
import smpl.sys.SmplException;
import java.util.*;

public class ExpProcedure extends Exp {

  ArrayList<String> params;
  Exp body;
  String listvar;

  public ExpProcedure(){
    super();
  }

  public ExpProcedure(ArrayList<String> params, Exp body){
    this(params, body, null);
  }

  public ExpProcedure(Exp body, String listvar){
    this(new ArrayList(), body, listvar);
  }

  public ExpProcedure(ArrayList<String> params, Exp body, String listvar){
    this.params = params;
    this.body = body;
    this.listvar = listvar;
  }

  public ArrayList<String> getParameters(){
    return params;
  }

  public Exp getBody(){
    return body;
  }

  public String getListVar(){
    return listvar;
  }

  @Override
  public <S, T> T visit(Visitor<S, T> v, S arg) throws SmplException {
    return v.visitExpProcedure(this, arg);
  }

  @Override
  public String toString() {
    return "Procedure: " + params + " -> " + body;
  }
}
