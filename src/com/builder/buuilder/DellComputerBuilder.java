package com.builder.buuilder;

import com.builder.product.ComputerProduct;

/**
 * 具体的建造者，实现抽象建造者中的各组件的具体创建过程
 * @author Administrator
 *
 */
public class DellComputerBuilder extends AbstractComputerBuilder{
	private ComputerProduct dellComputer = new ComputerProduct();
	@Override
	public AbstractComputerBuilder buildCpu() {
		System.out.println("build dell cpu");
		return this;
	}

	@Override
	public AbstractComputerBuilder buildMainBord() {
		System.out.println("build dell MainBord");
		return this;
	}

	@Override
	public AbstractComputerBuilder buildKeyBord() {
		System.out.println("build dell KeyBord");
		return this;
	}

	@Override
	public AbstractComputerBuilder buildHardDisk() {
		System.out.println("build dell HardDisk");
		return this;
	}

	@Override
	public ComputerProduct getComputerProduct() {
		return this.dellComputer;
	}

}
