package com.builder.buuilder;

import com.builder.product.ComputerProduct;

/**
 * 抽象的电脑建造者，将产品ComputerProduct的各组件（即属性）的创建过程抽象到此类中
 * 同时提供了返回完成产品的方法
 * 各组件的方法返回类型可以是AbstractComputerBuilder(即builder)对象，
 * 这样就可以链式创建各组件了，this.builder.buildCpu().buildHardDisk().buildKeyBord().buildMainBord();
 * 注意方法修饰符，如果不为public则在其他包里无法引用
 *
 */
public abstract class  AbstractComputerBuilder {
	//定义产品对象的各组件的创建与装配方法
	public abstract AbstractComputerBuilder buildCpu();
	public abstract AbstractComputerBuilder buildMainBord();
	public abstract AbstractComputerBuilder buildKeyBord();
	public abstract AbstractComputerBuilder buildHardDisk();
	//定义返回完整对象的方法
	public abstract ComputerProduct getComputerProduct();
}
