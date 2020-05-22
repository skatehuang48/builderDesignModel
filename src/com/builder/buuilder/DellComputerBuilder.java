package com.builder.buuilder;

import com.builder.product.ComputerProduct;

/**
 * ����Ľ����ߣ�ʵ�ֳ��������еĸ�����ľ��崴������
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
