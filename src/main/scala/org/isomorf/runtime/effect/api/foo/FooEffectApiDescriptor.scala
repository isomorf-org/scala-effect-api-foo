package org.isomorf.runtime.effect.api.foo

import org.isomorf.foundation.runtime.effects.plugins.EffectApiDescriptor

class FooEffectApiDescriptor extends EffectApiDescriptor[FooEffectApi] {

  override final val getHandle = "foo"

  override final val getType = classOf[FooEffectApi]
}
