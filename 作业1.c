//
//  main.c
//  homework3-30
//
//  Created by edz on 2020/3/30.
//  Copyright © 2020 twh. All rights reserved.
//

#include <stdio.h>


    
    double cuboid(double length,double width,double height)
    
    {
        double result;
        
        result = length * width * height;
        
        return result;
    }
   
    int main(void){
        double length,width,height;
        
        scanf("%lf长\n",&length);
        
        scanf("%lf宽\n",&width);
        
        scanf("%lf高\n",&height);
        
        printf("%lf 体积是\n",cuboid(length, width, height));

    }
