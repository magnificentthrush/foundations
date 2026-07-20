import exercises.generic.GenericFunctionExercises._

productNames
productPrices

productNames.zipWith(productPrices)((x,y) => Pair(x,y))