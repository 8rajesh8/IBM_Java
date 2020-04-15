package com.re.relation;

import com.re.one_to_one.MethodInterImp;
import com.re.one_to_one.Plant;
import com.re.one_to_one.Plant_Disc;

public class App 
{
    public static void main( String[] args )
    {
        //one-to-one
    	Plant_Disc pd=new Plant_Disc("very toxic!");
    	Plant plant=new Plant("NigthShade",pd);
    	MethodInterImp obj =new MethodInterImp();
    	obj.create(plant);
    }
}
