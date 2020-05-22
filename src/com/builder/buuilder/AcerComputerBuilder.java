package com.builder.buuilder;

import com.builder.product.ComputerProduct;

/**
 * 具体的建造者，实现抽象建造者中的各组件的具体创建过程
 * @author Administrator
 *
 */
public class AcerComputerBuilder extends AbstractComputerBuilder{
	private ComputerProduct acerComputer = new ComputerProduct();
	@Override
	public AbstractComputerBuilder buildCpu() {
		System.out.println("build acerComputer cpu");
		return this;
	}

	@Override
	public AbstractComputerBuilder buildMainBord() {
		System.out.println("build acerComputer MainBord");
		return this;
	}

	@Override
	public AbstractComputerBuilder buildKeyBord() {
		System.out.println("build acerComputer KeyBord");
		return this;
	}

	@Override
	public AbstractComputerBuilder buildHardDisk() {
		System.out.println("build acerComputer HardDisk");
		return this;
	}

	@Override
	public ComputerProduct getComputerProduct() {
		return this.acerComputer;
	}

}
