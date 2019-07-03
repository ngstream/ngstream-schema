package ngstream

package object schema {
  case class ReadId(readgroupId: Long, readId: String)

  case class FastqSequence(sequence: Seq[Byte], quality: Seq[Byte]) {
    require(sequence.size == quality.size, "Sequence and quality should be the same size")
  }

  case class FastqData(sequences: Seq[FastqSequence])
  case class Fastq(key: ReadId, value: FastqData)

}
