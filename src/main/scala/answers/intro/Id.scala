package answers.intro

case class Id[A](value: A) {

  def map[B](f: A => B): Id[B] =
    Id(f(value))

  def flatMap[B](f: A => Id[B]): Id[B] =
    f(value)
}

object Id {

  def point[A](v: A): Id[A] =
    Id(v)
}
