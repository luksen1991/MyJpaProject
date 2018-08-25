package info.lukasznowicki.jpa.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class PossibleTypes {

	@Id
	private long Id;
	private int someIt;
	private float someFloat;
	private double someDouble;
	private boolean someBoolean;

	private Integer someInteger;
	private BigDecimal someBigDecimal;
	private BigInteger someBigInteger;

	private int[] IntegerArray;
	private double[] DoubleArray;

	private MyEnum myEnum;

	@Transient
	private int ignoreField;

	public int getIgnoreField() {
		return ignoreField;
	}

	public void setIgnoreField(int ignoreField) {
		this.ignoreField = ignoreField;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public int getSomeIt() {
		return someIt;
	}

	public void setSomeIt(int someIt) {
		this.someIt = someIt;
	}

	public float getSomeFloat() {
		return someFloat;
	}

	public void setSomeFloat(float someFloat) {
		this.someFloat = someFloat;
	}

	public double getSomeDouble() {
		return someDouble;
	}

	public void setSomeDouble(double someDouble) {
		this.someDouble = someDouble;
	}

	public boolean isSomeBoolean() {
		return someBoolean;
	}

	public void setSomeBoolean(boolean someBoolean) {
		this.someBoolean = someBoolean;
	}

	public Integer getSomeInteger() {
		return someInteger;
	}

	public void setSomeInteger(Integer someInteger) {
		this.someInteger = someInteger;
	}

	public BigDecimal getSomeBigDecimal() {
		return someBigDecimal;
	}

	public void setSomeBigDecimal(BigDecimal someBigDecimal) {
		this.someBigDecimal = someBigDecimal;
	}

	public BigInteger getSomeBigInteger() {
		return someBigInteger;
	}

	public void setSomeBigInteger(BigInteger someBigInteger) {
		this.someBigInteger = someBigInteger;
	}

	public int[] getIntegerArray() {
		return IntegerArray;
	}

	public void setIntegerArray(int[] integerArray) {
		IntegerArray = integerArray;
	}

	public double[] getDoubleArray() {
		return DoubleArray;
	}

	public void setDoubleArray(double[] doubleArray) {
		DoubleArray = doubleArray;
	}

	public MyEnum getMyEnum() {
		return myEnum;
	}

	public void setMyEnum(MyEnum myEnum) {
		this.myEnum = myEnum;
	}

}
