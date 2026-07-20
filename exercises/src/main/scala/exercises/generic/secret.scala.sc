import exercises.generic.GenericFunctionExercises._

secret

secret.map(l => l.map(_.toChar).mkString).map(_.reverse).swap
