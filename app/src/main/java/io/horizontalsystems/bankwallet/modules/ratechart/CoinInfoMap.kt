package io.horizontalsystems.bankwallet.modules.ratechart

import java.math.BigDecimal

object CoinInfoMap {

    val data = mapOf(
            "BTC"   to CoinInfo(BigDecimal(21_000_000), "03/01/2009", "https://bitcoin.org/en"),
            "LTC"   to CoinInfo(BigDecimal(84_000_000), "13/10/2011", "https://litecoin.com"),
            "ETH"   to CoinInfo(null, "30/07/2015", "https://www.ethereum.org"),
            "BCH"   to CoinInfo(BigDecimal(21_000_000), "01/08/2017", "https://www.bitcoincash.org"),
            "DASH"  to CoinInfo(BigDecimal(18_900_000), "18/01/2014", "http://dash.org"),
            "BNB"   to CoinInfo(BigDecimal(187_536_713), "27/06/2017", "https://www.binance.com"),
            "EOS"   to CoinInfo(BigDecimal(1_035_000_004), "26/06/2017", "https://eos.io"),
            "AAVE"  to CoinInfo(BigDecimal(11_721_234), "02/10/2020","https://aave.com/"),
            "ADAI"  to CoinInfo(null, null, "https://aave.com/atokens"),
            "AKRO"  to CoinInfo(BigDecimal(4_000_000_000), "06/07/2019", "https://akropolis.io"),
            "AMN"   to CoinInfo(BigDecimal(1_209_963_685), null, "https://amon.tech/"),
            "AMPL"  to CoinInfo(BigDecimal(38_207_563), "14/06/2019", "https://www.ampleforth.org"),
            "ANJ"   to CoinInfo(BigDecimal(128_645_461), null,"https://coin_anj.aragon.org/"),
            "ANKR"  to CoinInfo(BigDecimal(10_000_000_000), "21/02/2019", "https://www.ankr.com"),
            "ANT"   to CoinInfo(BigDecimal(39_609_524), "05/05/2017", "https://aragon.one"),
            "AST"   to CoinInfo(BigDecimal(500_000_000), null,"https://www.airswap.io/"),
            "BAL"   to CoinInfo(BigDecimal(35_725_000), "20/06/2020", "https://balancer.finance"),
            "BAND"  to CoinInfo(BigDecimal(100_000_000), "09/09/2019","https://bandprotocol.com/"),
            "BAT"   to CoinInfo(BigDecimal(1_500_000_000), "31/05/2017", "https://basicattentiontoken.org"),
            "BNT"   to CoinInfo(null, "13/02/2017", "https://bancor.network"),
            "BTCB"  to CoinInfo(BigDecimal(9_001), "17/06/2019", "https://bitcoin.org/en"),
            "BUSD"  to CoinInfo(BigDecimal(28_603_822), "10/09/2019", "https://www.paxos.com/busd"),
            "CAS"   to CoinInfo(BigDecimal(1_000_000_000), "12/10/2017", "https://cashaa.com"),
            "CHSB"  to CoinInfo(BigDecimal(1_000_000_000), "08/09/2017", "https://swissborg.com"),
            "COMP"  to CoinInfo(BigDecimal(10_000_000), "04/03/2020", "https://compound.finance"),
            "CRO"   to CoinInfo(BigDecimal(100_000_000_000), "14/11/2019", "https://www.crypto.com/en/chain"),
            "CRPT"  to CoinInfo(BigDecimal(99_785_291), "28/09/2017", "https://crypterium.io"),
            "CVC"   to CoinInfo(BigDecimal(1_000_000_000), "21/06/2017", "https://www.civic.com"),
            "DAI"   to CoinInfo(BigDecimal(127_759_558), "18/11/2019", "https://makerdao.com/en"),
            "DIA"   to CoinInfo(BigDecimal(200_000_000), "27/11/2019", "https://diadata.org"),
            "DGD"   to CoinInfo(BigDecimal(2_000_000), "28/04/2016", "https://www.dgx.io"),
            "DGX"   to CoinInfo(BigDecimal(120_600), "29/03/2018", "https://digix.global/dgx#"),
            "DNT"   to CoinInfo(BigDecimal(1_000_000_000), "08/08/2017", "https://district0x.io"),
            "DOS"   to CoinInfo(BigDecimal(1_000_000_000), "11/03/2019", "https://dos.network"),
            "ELF"   to CoinInfo(BigDecimal(880_000_000), "18/12/2017", "http://aelf.io"),
            "ENJ"   to CoinInfo(BigDecimal(1_000_000_000), "24/07/2017", "https://enjincoin.io"),
            "EOSDT" to CoinInfo(BigDecimal(170_000_000), "31/05/2019", "https://eosdt.com/en"),
            "EURS"  to CoinInfo(null, "22/06/2018", "https://stasis.net"),
            "IQ"    to CoinInfo(BigDecimal(10_006_128_771), "14/07/2018", "https://everipedia.org"),
            "GUSD"  to CoinInfo(null, "09/09/2018", "https://gemini.com/dollar"),
            "GTO"   to CoinInfo(BigDecimal(1_000_000_000), "14/12/2017", "https://gifto.io"),
            "GNT"   to CoinInfo(BigDecimal(1_000_000_000), "17/11/2016", "https://golem.network"),
            "HOT"   to CoinInfo(BigDecimal(177_619_433_541), "16/01/2018", "https://thehydrofoundation.com"),
            "HT"    to CoinInfo(BigDecimal(500_000_000), "22/01/2018", "https://www.huobi.pro"),
            "IDXM"  to CoinInfo(null, null, "https://idex.market/eth/idex"),
            "IDEX"  to CoinInfo(BigDecimal(1_000_000_000), "28/09/2017", "https://auroradao.com"),
            "KCS"   to CoinInfo(BigDecimal(176_863_551), "15/09/2017", "https://www.kucoin.com"),
            "KNC"   to CoinInfo(BigDecimal(210_590_429), "20/09/2017", "https://kyber.network"),
            "LEND"  to CoinInfo(BigDecimal(1_299_999_942), "15/08/2017", "https://aave.com"),
            "LINK"  to CoinInfo(BigDecimal(1_000_000_000), "19/09/2017", "https://link.smartcontract.com"),
            "LOOM"  to CoinInfo(BigDecimal(1_000_000_000), "03/03/2018", "https://loomx.io"),
            "LRC"   to CoinInfo(BigDecimal(1_374_513_897), "06/08/2017", "https://loopring.org"),
            "MANA"  to CoinInfo(BigDecimal(2_644_403_343), "08/08/2017", "https://decentraland.org"),
            "MCO"   to CoinInfo(BigDecimal(31_587_682), "18/05/2017", "https://crypto.com/en/index.html"),
            "MEETONE" to CoinInfo(BigDecimal(10_000_000_000), "05/05/2018", "https://meet.one"),
            "MITH"  to CoinInfo(BigDecimal(1_000_000_000), "12/03/2018", "https://mith.io"),
            "MKR"   to CoinInfo(BigDecimal(1_000_000), "15/08/2015", null),
            "NDX"   to CoinInfo(BigDecimal(10_000_000_000), null, null),
            "NEXO"  to CoinInfo(BigDecimal(1_000_000_000), "29/04/2018", "https://omg.network"),
            "NPXS"  to CoinInfo(BigDecimal(259_810_708_833), "27/09/2017", "https://pundix.com"),
            "NUT"   to CoinInfo(BigDecimal(10_000_000), "26/02/2019", "https://mith.io"),
            "OMG"   to CoinInfo(null, "23/06/2017", "https://nexo.io"),
            "ORBS"  to CoinInfo(BigDecimal(10_000_000_000), "14/03/2018", "https://www.orbs.com"),
            "OXT"   to CoinInfo(BigDecimal(10_000_000_000), "03/12/2019", "https://www.orchid.com"),
            "PAR"   to CoinInfo(BigDecimal(999_628_334), null, "https://www.parachutetoken.com"),
            "PAX"   to CoinInfo(BigDecimal(249_952_065), "10/09/2018", "https://www.paxos.com/pax"),
            "PAXG"  to CoinInfo(BigDecimal(2_410), "29/08/2019", "https://www.paxos.com/paxgold"),
            "PGL"   to CoinInfo(BigDecimal(220_000_000), "19/04/2017", "https://prospectors.io/en"),
            "POLY"  to CoinInfo(BigDecimal(1_000_000_000), "25/12/2017", "https://www.polymath.network"),
            "PPT"   to CoinInfo(BigDecimal(53_252_246), "12/04/2017", "https://populous.world"),
            "PTI"   to CoinInfo(BigDecimal(3_600_000_000), "13/03/2018", "https://tokensale.paytomat.com"),
            "R"     to CoinInfo(BigDecimal(1_000_000_000), "04/08/2017", "http://revain.org"),
            "RARI"  to CoinInfo(BigDecimal(25_000_000), null,"https://rarible.com/"),
            "REN"   to CoinInfo(BigDecimal(999_999_633), "31/12/2017", "https://renproject.io"),
            "RENBCH" to CoinInfo(null, null, "https://renproject.io"),
            "RENBTC" to CoinInfo(null, null, "https://renproject.io"),
            "RENZEC" to CoinInfo(null, null, "https://renproject.io"),
            "REP"   to CoinInfo(null, "17/11/2014", "https://www.augur.net"),
            "SAI"   to CoinInfo(null, "18/12/2017", "https://makerdao.com/en"),
            "SNT"   to CoinInfo(BigDecimal(6_804_870_174), "20/06/2017", "https://status.im"),
            "SNX"   to CoinInfo(BigDecimal(190_075_446), "07/01/2018", "https://www.synthetix.io"),
            "SWAP"  to CoinInfo(BigDecimal(100_000_000), "09/07/2020", "https://trustswap.org"),
            "TKN"   to CoinInfo(BigDecimal(39_406_760), "25/04/2017", "https://monolith.xyz"),
            "TUSD"  to CoinInfo(null, "31/03/2018", "https://www.trusttoken.com"),
            "UNI"   to CoinInfo(BigDecimal(1_000_000_000), null, "https://uniswap.org/"),
            "USDC"  to CoinInfo(BigDecimal(931_069_099), "17/05/2018", "https://www.centre.io/usdc"),
            "USDT"  to CoinInfo(BigDecimal(9_479_177_442), "10/06/2014", "https://tether.to"),
            "WBTC"  to CoinInfo(BigDecimal(21_000_000), "27/11/2018", "https://wbtc.network"),
            "WETH"  to CoinInfo(BigDecimal(1_153_917), "31/12/2018", "https://weth.io"),
            "WFIL"  to CoinInfo(null, null, "https://www.wrapped.com/"),
            "WTC"   to CoinInfo(BigDecimal(70_000_000), "27/08/2017", "https://www.waltonchain.org/en"),
            "XFT"   to CoinInfo(BigDecimal(10_000_000), null, "https://offshift.io/"),
            "XRP"   to CoinInfo(BigDecimal(99_990_932_726), "02/02/2013", "https://ripple.com/xrp"),
            "ZRX"   to CoinInfo(BigDecimal(1_000_000_000), "15/08/2017", "https://www.0xproject.com"),
            "ZEC"   to CoinInfo(BigDecimal(21_000_000), "28/10/2016", "https://z.cash"),
            "THKDB" to CoinInfo(BigDecimal(90_000_000_000), null, "https://trusttoken.com"),
            "TAUDB" to CoinInfo(BigDecimal(90_000_000_000), null, "https://trusttoken.com"),
            "TUSDB" to CoinInfo(BigDecimal(90_000_000_000), null, "https://trusttoken.com"),
            "USDSB" to CoinInfo(BigDecimal(90_000_000_000), null, "https://www.stably.io"),
            "HYN"   to CoinInfo(BigDecimal(10_000_000_000), null, "https://www.hyn.space"),
            "DEFI"  to CoinInfo(BigDecimal(2_500_000_000),  null, "https://www.defilab.com"),
            "RUNE"  to CoinInfo(BigDecimal(500_000_000),    null, "https://thorchain.org"),
            "MATIC_BEP2" to CoinInfo(BigDecimal(10_000_000_000), null, null),
            "ONE"   to CoinInfo(BigDecimal(12_600_000_000), null, "https://harmony.one/"),
            "IRIS"  to CoinInfo(BigDecimal(2_000_000_000), null, "https://www.irisnet.org/"),
            "ETH_BEP2"   to CoinInfo(BigDecimal(215_000), null, null),
            "SWINGBY"    to CoinInfo(BigDecimal(1_000_000_000), null, "https://swingby.network"),
            "CHZ"   to CoinInfo(BigDecimal(8_888_888_888), null, "https://www.chiliz.com"),
            "SHR"   to CoinInfo(BigDecimal(4_396_000_000), null, "https://sharering.network/"),
            "USDT_BEP2"  to CoinInfo(BigDecimal(80_000_000), null, null),
            "WICC"  to CoinInfo(BigDecimal(210_000_000), null, "https://www.waykichain.com/"),
            "WRX"   to CoinInfo(BigDecimal(995_833_334), null, "https://wazirx.com"),
            "COS"   to CoinInfo(BigDecimal(9_400_000_000), null, "https://www.contentos.io"),
            "LTO"   to CoinInfo(BigDecimal(500_000_000), null, "https://lto.network"),
            "MTXLT" to CoinInfo(BigDecimal(900_000), null, "https://tixl.me")


    )
}

data class CoinInfo(val supply: BigDecimal?, val startDate: String?, val website: String?)