# Plans

Due to specification: number of floors is integer and always greater than 0.

Test Cases:
- ✅ 1 floor --> 1 element list
- ✅ 1 floor --> first element equals to `*`
- ✅ 2 floors --> 2 element list
- ✅ 2 floors --> result equals to 
  ```text
   * 
  ***
  ```
- ✅ 3 floors --> result equals to
  ```text
    *  
   *** 
  *****
  ```
