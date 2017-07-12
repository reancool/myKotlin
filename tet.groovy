
def jsonSlurper = new groovy.json.JsonSlurper()
def config = jsonSlurper.parseText '''
   {
   "isbuy": false,
  "buy": {
    "mult_layer": {
      "layers": [
        0,
        1,
        2
      ]
    },
    "single_layer": {
      "layer": 5
    },
    "is_mult":false
  },
  "manage": {
    "mult_layer": {
      "layers": [
        0,
        1,
        2
      ]
    },
    "single_layer": {
      "layer": 5,
      "po_in_gods_m": 0
    },
    "is_mult":false
  }
}'''

println config.isbuy
println config.buy.is_mult
println config.buy.mult_layer.layers
println config.buy.single_layer.layer
println config.manage.is_mult
println config.manage.mult_layer.layers
println config.manage.single_layer.layer
println config.manage.single_layer.po_in_gods_m
if(config.isbuy){
    println "isbuy"
}else {
    println "manage"
}



