# Console Graph
One of the early exercises we were given in our Java module in DCU was to draw a Sine wave vertically on the screen. The expected output was something like this:
```
                      # 
                   #
                #
             #
          #
        #
      #
    #
  #
 #
 #
 #
 #
 #
  #
   #
     #
       #
         #
            #
               #
                  #
```
My first attempt was relatively simple, shown in the source file `SineWaveV1.java`. It pretty much just sticks to the instructions,
except I defined a constant `COLUMNS` to bring a little control to the output.

Looking at the output, I thought it would be improved by adding an axis line. The next attempt, `SineWaveV2.java`, does just that,
so the (partial) output is something like this:
```
                                      |                                    #    
                                      |                                  #      
                                      |                                 #       
                                      |                               #         
                                      |                             #           
                                      |                           #             
                                      |                        #                
                                      |                     #                   
                                      |                  #                      
                                      |               #                         
                                      |           #                             
                                      |        #                                
                                      |    #                                    
                                      |#                                        
                                    # |                                         
                                 #    |                                         
                             #        |                                         
                         #            |                                         
                      #               |                                         
                  #                   |                                         
               #                      |                                         
            #                         |                                         
          #                           |                                         
       #                              |                                         
     #                                |                                         
    #                                 |                                         
  #                                   |                                         
 #                                    |                                         
 #                                    |                                         
 #                                    |                                         
 #                                    |                                         

```
Not bad, but I'm used to looking at graphs with a horizontal x-axis, not vertical. And wouldn't it be nice to output any arbitrary
function, not just Sine waves? The final application, `Graph.java`, allows the user to pass lambda expressions, and as an added
bonus, they can choose what character to output for each function. Users can call the `drawFunction` method multiple times, and 
when ready, call `printGraph()` to show it all on screen.

The final program shows both a Sine and Cosine function on the same graph. Here is the output:
```
                                   |                                            
                                   |                                            
                                 *****         #####                            
                              ***  |  ***   ###     ###                         
#                            *     |     *##           #                        
 ##                        **      |     # *            ##                      
   #                      *        |    #   *             #                     
    #                    *         |  ##     **            #                    
     #                 **          | #         *            ##                  
      #               *            |#           *             #               * 
-------##------------*-------------#-------------*-------------#------------**--
         #          *             #|              *             #          *    
          #        *             # |               *             #        *     
           #      *             #  |                *             #      *      
            #    *            ##   |                 **            #    *       
*            ##**            #     |                   *            ##**        
 **          **#           ##      |                    **           *##        
   **      **   ###      ##        |                      **      ***   ##      
     ******        ######          |                        ******        ##### 
                                   |                                            
```

Functions can be as simple or as complex as you like. Here are a few examples:

```Java
drawFunction('2', x -> Math.pow(x, 2));
drawFunction('3', x -> Math.pow(x, 3));
drawFunction('4', x -> Math.pow(x, 4));
drawFunction('5', x -> Math.pow(x, 5));
drawFunction('x', x -> (5 * Math.pow(x, 3)) + (3 * Math.pow(x, 2) - (2 * x)));
```
