object FindMissingNumber {
   def main(args: Array[String]) {
      val a = Array[Int](1,2,3,4,6)
      println("Missing number in Array: "+missingNumber(a))
     
      def missingNumber(a:Array[Int]):Int={
         var sum = (a.length+1)*(a.length+2)/2
         println(sum)
         for(i<-0 to a.length-1)
            sum=sum-a(i)
        sum    
     }
   }
}
