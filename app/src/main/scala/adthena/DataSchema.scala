package adthena


object DataSchema {

  import java.sql.Date

  case class ScrapeAppearances(
                                date: Date,
                                device: String,
                                searchTerm: String,
                                scrapeCount: Int
                              )

  case class CompetitorAppearances(
                                    date: Date,
                                    device: String,
                                    searchTerm: String,
                                    domain: String,
                                    appearances: Int
                                  )

  case class Volumes(
                      searchTerm: String,
                      device: String,
                      volume: Int
                    )

  case class RelevantCompetitors(
                                  accountId: Int,
                                  domain: String
                                )

  case class RelevantSearchTerms(
                                  accountId: Int,
                                  searchTerm: String
                                )

  case class Impressions(
                        accountId: Int,
                        date: Date,
                        domain: String,
                        impressions: Int
                        )


}
