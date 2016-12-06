/*
 * Adapted from FnPlot
 */

package smpl.values;

import smpl.sys.SmplException;
import static smpl.values.SmplValue.make;

public class SmplBool extends SmplValue<SmplBool> {

	boolean val;

	public SmplBool() {
		this(false);
	}

	public SmplBool(boolean v){
		val = v;
	}

	@Override
	public SmplType getType(){
		return SmplType.BOOLEAN;
	}


	public SmplValue<?> eq(SmplValue<?> arg) throws SmplException {
		if(arg.getType() == SmplType.BOOLEAN)
			return make(val == arg.boolValue());
		else
			throw new TypeSmplException(SmplType.BOOLEAN, arg.getType());
	}

	public SmplValue<?> neq(SmplValue<?> arg) throws SmplException {
		if(arg.getType() == SmplType.BOOLEAN)
			return make(val != arg.boolValue());
		else
			throw new TypeSmplException(SmplType.BOOLEAN, arg.getType());
	}

	// return literal values

	public boolean boolValue() throws TypeSmplException {
		return val;
	}

	@Override
	public String toString() {
		return val ? "true" : "false";
	}
}