package com.builder.director;

import com.builder.buuilder.AbstractComputerBuilder;
import com.builder.product.ComputerProduct;

/**
 * 
 * 指挥者，与客户端交互，根据客户端传入的具体builder创建不同的产品对象
 *
 */
public class ComputerDirector {

	private AbstractComputerBuilder builder;
	
	//1.构造方法方式注入builder
	public ComputerDirector(AbstractComputerBuilder builder){
		this.builder = builder;
	}
	//2.set方式注入builder
	public void setAbstractComputerBuilder(AbstractComputerBuilder builder){
		this.builder = builder;
	}
	
	//开始建造组件装载产品
	public ComputerProduct build(){
		return this.builder.buildCpu().buildHardDisk().buildKeyBord().buildMainBord().getComputerProduct();
	}
}
