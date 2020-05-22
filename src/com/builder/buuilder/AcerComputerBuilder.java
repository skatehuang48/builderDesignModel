package com.builder.buuilder;

import com.builder.product.ComputerProduct;

/**
 * ����Ľ����ߣ�ʵ�ֳ��������еĸ�����ľ��崴������
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
